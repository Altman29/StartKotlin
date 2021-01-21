package com.altman29.startkotlin.collections

import java.lang.Math.abs

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc:
 */

val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
val natural = shuffled.sorted()                             // 2
val inverted = shuffled.sortedBy { -it }                    // 3
val descending = shuffled.sortedDescending()                // 4
val descendingBy = shuffled.sortedByDescending { abs(it)  } // 5

/*
Shuffled: [5, 4, 2, 1, 3, -10]
Natural order: [-10, 1, 2, 3, 4, 5]
Inverted natural order: [5, 4, 3, 2, 1, -10]
Inverted natural order value: [5, 4, 3, 2, 1, -10]
Inverted natural order of absolute values: [-10, 5, 4, 3, 2, 1]
 */