package com.gio

fun main(args: Array<String>) {
    println(OuterCLass.NestedClass().description)

    var obj = OuterCLass.NestedClass() // object creation
    obj.foo()

//    var obj1 = OuterCLass.InnerClass() // object creation
//    obj1.foo
}

class OuterCLass {
    private var name: String = "MR X"
    class NestedClass {
        var description: String = "Code inside"
        private var id: Int = 101
        fun foo() {
//            println("name is $name") // cannot access  the outer class member
            println("Id is $id")
        }
    }

    inner class InnerClass {
        var description: String = "Code inside"
        private var id: Int = 101
        fun foo() {
            println("name is $name") // can access  the outer class member
            println("Id is $id")
        }
    }
}