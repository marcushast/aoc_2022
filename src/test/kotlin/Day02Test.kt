import org.junit.jupiter.api.Test

internal class Day02Test {

    @Test
    fun Problem1_1() {
        Day02.work1(Day02.process1(Day02.data1))
    }

    @Test
    fun Problem1_2() {
        Day02.work1(Day02.process1(Day02.data2))
    }

    @Test
    fun Problem2_1() {
        Day02.work1(Day02.process2(Day02.data1))
    }

    @Test
    fun Problem2_2() {
        Day02.work1(Day02.process2(Day02.data2))
    }

}