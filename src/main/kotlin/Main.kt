import kotlinx.serialization.Serializable

fun main() {
    @Serializable
    data class TestData(val a: Int)

    println(TestData(1))
}
