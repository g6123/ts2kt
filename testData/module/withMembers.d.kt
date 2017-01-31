package withMembers

@module
object Foo {
    interface A {
        fun baz()
    }
    open class B {
        open fun boo(): Unit = definedExternally
    }
    var c: Number = definedExternally
    fun d(a: Boolean, b: Any, c: SomeType): Unit = definedExternally
}
