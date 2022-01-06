//14503 백준
package 구현

import java.io.*
import java.util.*
import kotlin.properties.Delegates

val dx = arrayOf(0, 1, 0, -1)
val dy = arrayOf(-1, 0, 1, 0)
var arr: Array<Array<Int>> = arrayOf(arrayOf())
var cnt = 0
var n = 0
var m = 0

fun main() = with(System.`in`.bufferedReader()) {
    var st = StringTokenizer(readLine())
    n = st.nextToken().toInt()
    m = st.nextToken().toInt()
    arr = Array(n) { Array(m) { 0 } }

    st = StringTokenizer(readLine())
    val x = st.nextToken().toInt()
    val y = st.nextToken().toInt()
    val direction = st.nextToken().toInt()

    for (i in 0 until n) {
        st = StringTokenizer(readLine())
        for (j in 0 until m) {
            arr[i][j] = st.nextToken().toInt()
        }
    }

    calc(x, y, direction)
    print(cnt)
}

fun calc(x: Int, y: Int, direction: Int) {
    var xx = 0
    var yy = 0
    if (arr[x][y] == 0) {
        ++cnt
        arr[x][y] = 1
    }
    if(direction == 0){

    }
}