package com.example.kotlinpractice.object_oriented_programming.composition

fun main() {
    val category1 = Catagories(1, "Sci-Fi")
    val category2 = Catagories(2, "Anime")

    val director1 = Directors(1, "Denis Villeneuve")
    val director2 = Directors(2, "Christopher Nolan")

    val movie1 = Movies(1, "Dune Part Two", 2024, category1, director1) //composition - erişme

    println("Film Id: ${movie1.movie_id}")
    println("Film Adı: ${movie1.movie_name}")
    println("Film Tarihi: ${movie1.movie_date}")
    println("Film Kategorisi: ${movie1.category.category_name}")
    println("Film Yönetmeni: ${movie1.director.director_name}")

}