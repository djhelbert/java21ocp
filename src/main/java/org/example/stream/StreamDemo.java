package org.example.stream;

import static java.util.stream.Collectors.*;
import static org.example.Util.*;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        final List<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.add("Fourth");
        strings.add("Fifth");
        strings.add("First");

        strings.stream().filter(s -> !"Second".equals(s)).map(s -> s.toUpperCase()).sorted().forEach(System.out::println);

        Map<String, Boolean> map = strings.stream().distinct().collect(toMap(Function.identity(), s -> s.contains("i")));
        print(map);

        Set<String> set = strings.stream().collect(toUnmodifiableSet());
        print(set);

        String result = strings.stream().sorted().collect(joining(" ")); // Join elements
        print(result);

        Optional<String> o = strings.stream().filter(s -> s.contains("ir")).findFirst(); // find first string with ir
        if(o.isPresent()) {
            print(o.get());
        }

        OptionalInt oi = strings.stream().mapToInt(String::length).max(); // get max string length
        if(oi.isPresent()) {
            print("Max Length:" + oi.getAsInt());
        }

        Map<Integer, Set<String>> groupMap = strings.stream().collect(groupingBy(String::length, toSet()));
        print(groupMap);

        Map<Boolean, List<String>> partMap = strings.stream().collect(partitioningBy(s -> s.length() > 5));
        print(partMap);

        Blog blog1 = new Blog("1", "Nice", "Very Nice");
        Blog blog2 = new Blog("2", "Disappointing", "Ok", "Could be better");
        List<Blog> blogs = List.of(blog1, blog2);

        Map<String, List<String>> authorComments = blogs.stream()
                .collect(Collectors.groupingBy(Blog::getAuthorName,
                        Collectors.flatMapping(blog -> blog.getComments().stream(), Collectors.toList())));
        print(authorComments);
    }
}

/**
 * protected not allowed here
 */
class Blog {
    private String authorName;
    private List<String> comments;

    public Blog(String name, String... quotes) {
        this.authorName = name;
        comments = Arrays.asList(quotes);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
