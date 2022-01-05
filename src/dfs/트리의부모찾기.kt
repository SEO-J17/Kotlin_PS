//11725_백준
package dfs

import java.io.*
import java.util.*

var list: MutableList<MutableList<Int>> = mutableListOf()
var result: Array<Int> = arrayOf()
var num = 0

fun main() = with(System.`in`.bufferedReader()) {
    num = readLine().toInt()
    list = mutableListOf(mutableListOf())
    result = Array(num + 1) { 0 }

    for (i in 0..num) {
        list.add(mutableListOf())
    }

    for (i in 0 until num - 1) {
        val temp = StringTokenizer(readLine())
        val idx1 = temp.nextToken().toInt()
        val idx2 = temp.nextToken().toInt()
        list[idx1].add(idx2)
        list[idx2].add(idx1)
    }

   calc()

    val sb = StringBuilder()
    for (i in 2..num) {
          sb.append(result[i]).append("\n")
    }

    print(sb)

}

fun calc() {
    val qu: Queue<Int> = LinkedList()
    qu.add(1)
    while (!qu.isEmpty()) {
        val node = qu.poll()
        for (i in list.get(node)) {
            if (result[i] == 0) {
                qu.add(i)
                result[i] = node
            }
        }
    }
}
