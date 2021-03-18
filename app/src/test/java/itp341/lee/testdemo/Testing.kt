package itp341.lee.testdemo

import com.google.common.truth.Truth.*
import org.junit.Test


class MathUnitTest {
    @Test
    fun addition_isCorrect(){
        val sum = 2 + 2
        assertThat(sum).isEqualTo(4)
    }
}