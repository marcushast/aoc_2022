import org.junit.jupiter.api.Test

internal class Day06Test {

    @Test
    fun Problem1_1() {
        Day06.work1(Day06.process1(Day06.data1))
    }

    @Test
    fun Problem1_2() {
        Day06.work1(Day06.process1(Day06.data2))
    }

    @Test
    fun Problem2_1() {
        Day06.work2(Day06.process1(Day06.data1))
    }

    @Test
    fun Problem2_2() {
        Day06.work2(Day06.process1(Day06.data2))
    }

}