/**
 * Assign value in compile time
 */
const val rocks = 3

/**
 * Assign value in runtime
 */
val number = 5

fun complexFunctionCall() {}

val result = complexFunctionCall()

const val CONSTANT = "top-level constant"

interface SampleInterface {
    fun sameple()
}

object ObjectClass : SampleInterface {
    const  val CONSTANT = "constant inside object"

    interface ObjectInterface {

    }

    override fun sameple() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
val objectClass = ObjectClass.sameple()

class CompanionObject : SampleInterface {

    companion object : SampleInterface {
        const val CONSTANT = "constant inside companion"

        interface CompanionObject {

        }

        override fun sameple() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    }

    override fun sameple() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

/**

In Kotlin, we can make to level constants and assign them a value at compile time using const val

So then we have val and const val and what is the difference
for both we can assign a value directly
but const val, the value is always determined at compile time

Well, with val, the value that is assigned can be determined during program execution

So, for val we can assign the return value from a function as it's value because we can set it during execution

const val is set at compile time. So we cannot call and execute a function to get it's value set

However, const val only works at the top level and in classes declared with lesson6_objects not with regular class declared with class

So, we can use this to create a file or lesson6_objects that contains only constants and import them one-by-one

Kotlin does not have a concept of class level constants

To define constants inside a class you have to wrap them into a companion lesson6_objects

The basic difference between companion lesson6_objects and regular lesson6_objects is as follows

Companion lesson6_objects are initialized from the static constructor of the containing class. that is, they are created when the lesson6_objects is created.

Plain lesson6_objects are initialized lazily on the first access to that lesson6_objects. that is, when they are first used.

There is more, but all that you need to know is to wrap constanis in classes inside a companion lesson6_objects.


 */