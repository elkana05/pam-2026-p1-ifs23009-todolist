package utils

object InputUtil {

    fun input(
        prompt: String
    ): String {
        print("$prompt : ")
        return readlnOrNull() ?: ""
    }
}
