package belajar.oop.app

import belajar.oop.model.ExecutiveCustomer
import belajar.oop.model.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Bruce")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Tony", 1_000_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}