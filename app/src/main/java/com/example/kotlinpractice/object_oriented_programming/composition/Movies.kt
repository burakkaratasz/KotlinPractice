package com.example.kotlinpractice.object_oriented_programming.composition

data class Movies(var movie_id: Int,
                  var movie_name: String,
                  var movie_date: Int,
                  var category: Catagories, //foreign key
                  var director: Directors) {
}