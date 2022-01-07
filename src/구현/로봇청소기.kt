//14503 백준
package 구현

import java.io.*
import java.util.*

val dx = arrayOf(-1, 0, 1, 0)
val dy = arrayOf(0, 1, 0, -1)
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
    var stand = direction
    if (arr[x][y] == 0) {
        ++cnt
        arr[x][y] = 7       //청소
    }

    var isClean = false
    for (i in 0 until 4) {
        val dd = (stand + 3) % 4        //왼쪽으로 회전
        val xx = x + dx[dd]                 //이동
        val yy = y + dy[dd]                 //이동

        if (xx > 0 && yy > 0 && xx < n && yy < m) {
            if (arr[xx][yy] == 0) {
                calc(xx, yy, dd)
                isClean = true
                break
            }
        }
        stand = (stand + 3) % 4
    }

    if (!isClean) {
        val dd = (direction + 2) % 4     //후진방향
        val xx = x + dx[dd]
        val yy = y + dy[dd]
        if (xx > 0 && yy > 0 && xx < n && yy < m) {
            if (arr[xx][yy] != 1) {
                calc(xx, yy, direction)
            }
        }
    }
}