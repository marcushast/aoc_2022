import org.junit.jupiter.api.Test

internal class Day03Test {

    @Test
    fun Problem1_1() {
        Day03.work1(Day03.process1(Day03.data1))
    }

    @Test
    fun Problem1_2() {
        Day03.work1(Day03.process1(Day03.data2))
    }

    @Test
    fun Problem2_1() {
        Day03.work2(Day03.process2(Day03.data1))
    }

    @Test
    fun Problem2_2() {
        Day03.work2(Day03.process2(Day03.data2))
    }

}