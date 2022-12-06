package day33_Statics;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AcceessModifiers_Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.defaultData); visible only in the package, not visible outside of the package
        //System.out.println(AccessModifiers.privateData); visible ONLY in the class,
                                                            // not reachable outside the class or package


    }
}
