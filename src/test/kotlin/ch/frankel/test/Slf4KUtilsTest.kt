// This is a different package on purpose
package ch.frankel.test

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

import ch.frankel.slf4k.debug

class Slf4KUtilsTest {

    lateinit private var logger: Logger

    @BeforeMethod
    protected fun setUp() {
        logger = LoggerFactory.getLogger("Foo")
    }

    private fun throwException(): String {
        throw RuntimeException("Failure")
    }

    @Test
    fun simple_debug_should_not_throw_exception_if_wrapped_in_lambda() {
        logger.debug { throwException() }
    }

    @Test(expectedExceptions = arrayOf(RuntimeException::class))
    fun simple_debug_should_throw_exception_if_not_wrapped_in_lambda() {
        logger.debug (throwException())
    }

    @Test
    fun debug_with_arg_should_not_throw_exception_if_wrapped_in_lambda() {
        logger.debug("Foo") { throwException() }
    }

    @Test(expectedExceptions = arrayOf(RuntimeException::class))
    fun debug_with_arg_should_throw_exception_if_not_wrapped_in_lambda() {
        logger.debug("Foo", throwException())
    }

    @Test
    fun debug_with_2_args_should_not_throw_exception_if_wrapped_in_lambda() {
        logger.debug("Foo", { Object() }, { throwException() })
    }

    @Test(expectedExceptions = arrayOf(RuntimeException::class))
    fun debug_with_2_args_should_throw_exception_if_not_wrapped_in_lambda() {
        logger.debug("Foo", Object(), throwException())
    }

    @Test
    fun debug_with_3_args_should_not_throw_exception_if_wrapped_in_lambda() {
        logger.debug("Foo", { Object() }, { Object() }, { throwException() })
    }

    @Test(expectedExceptions = arrayOf(RuntimeException::class))
    fun debug_with_3_args_should_throw_exception_if_not_wrapped_in_lambda() {
        logger.debug("Foo", Object(), Object(), throwException())
    }
}