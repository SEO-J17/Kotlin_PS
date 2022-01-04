import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    val person = Array(num, { Array(2, { 1 }) })
    val sb = StringBuilder()
    for (i in 0..num - 1) {
        val st = StringTokenizer(br.readLine())
        person[i][0] = st.nextToken().toInt()
        person[i][1] = st.nextToken().toInt()
    }

    for (i in 0..num - 1) {
        var grade = 1
        for (j in 0..num - 1) {
            if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                grade++
            }
        }
        sb.append(grade).append(" ")
    }

    print(sb)

}