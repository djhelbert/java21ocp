module java21ocp { // open allows reflection for the entire module
    requires java.logging;
    requires java.desktop;
    // requires static module_name; // compile time only
    // requires transitive module_name; // force any downstream consumers also to read our required dependencies
    exports org.example.module;
    // export org.example.module to com.specific.package;
    // uses class.name;
    provides org.example.module.ModuleService with org.example.module.ModuleServiceImpl;
    // opens org.example.module; // alternative to open for the entire module
    // opens org.example.module to moduleOne, moduleTwo, etc.;
}