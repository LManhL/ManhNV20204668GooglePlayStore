package com.example.manhnv20204668googleplaystore

class App() {
    var logoPath: String = ""
    var title: String = ""
    var rate: Double = 0.0

    constructor(logoPath: String, title: String, rate: Double): this(){
        this.logoPath = logoPath
        this.title = title
        this.rate = rate
    }
}