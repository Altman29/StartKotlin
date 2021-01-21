package com.altman29.startkotlin.productivityboosters

import org.json.JSONArray

/**
 * Created by Csy on 1/21/21.
 * e-mail:altman29@foxmail.com
 * Desc: Named Arguments
 */
fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {
    println(format("mario", "example.com"))                         // 1
    println(format("domain.com", "username"))                       // 2
    println(format(userName = "foo", domain = "bar.com"))           // 3
    println(format(domain = "frog.com", userName = "pepe"))         // 4
    
}