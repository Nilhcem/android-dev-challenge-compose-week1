/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.DogGender.FEMALE
import com.example.androiddevchallenge.DogGender.MALE

data class Dog(
    val id: Long,
    val name: String,
    @DrawableRes val resId: Int,
    val gender: DogGender,
    val location: String,
    val description: String
)

enum class DogGender(val label: String) {
    MALE("Male"),
    FEMALE("Female")
}

val dogs = listOf(
    Dog(1, "Cupcake", R.drawable.dog01, MALE, "Campbell, CA", "Cuddly toddler"),
    Dog(2, "Donut", R.drawable.dog02, MALE, "Campbell, CA", "Needs special human"),
    Dog(3, "Eclair", R.drawable.dog03, FEMALE, "Milpitas, CA", "Happy-go-luck girl"),
    Dog(4, "Froyo", R.drawable.dog04, MALE, "San Jose, CA", "Special Needs Boy!"),
    Dog(5, "Ginger", R.drawable.dog05, MALE, "Campbell, CA", "Gentle to all"),
    Dog(6, "Honey", R.drawable.dog06, FEMALE, "San Jose, CA", "Looking for love"),
    Dog(7, "I.C.S.", R.drawable.dog07, MALE, "Milpitas, CA", "Gentle and affectionate"),
    Dog(8, "JellyB", R.drawable.dog08, FEMALE, "Milpitas, CA", "Likes a smooch or two"),
    Dog(9, "KitKat", R.drawable.dog09, MALE, "San Jose, CA", "Looking for love"),
    Dog(10, "Lolli", R.drawable.dog10, FEMALE, "San Jose, CA", "Perfect"),
    Dog(11, "Marsh", R.drawable.dog11, MALE, "San Jose, CA", "Loves kids!"),
    Dog(12, "Nougat", R.drawable.dog12, MALE, "Campbell, CA", "Sweet and sweeter"),
    Dog(13, "Oreo", R.drawable.dog13, MALE, "Campbell, CA", "Looking for love"),
    Dog(14, "Pie", R.drawable.dog14, MALE, "Campbell, CA", "Looking for love"),
    Dog(15, "Android", R.drawable.dog15, FEMALE, "Campbell, CA", "Gentle to all"),
    Dog(16, "Loki", R.drawable.dog16, MALE, "San Jose, CA", "Needs special human"),
    Dog(17, "Tiki", R.drawable.dog17, MALE, "San Jose, CA", "Gentle to all"),
    Dog(18, "Athena", R.drawable.dog18, FEMALE, "Milpitas, CA", "Perfect"),
    Dog(19, "Charlie", R.drawable.dog19, FEMALE, "Milpitas, CA", "Gentle to all"),
    Dog(20, "Tibi", R.drawable.dog20, MALE, "Milpitas, CA", "Needs special human"),
    Dog(21, "Broadsmith", R.drawable.dog21, MALE, "San Jose, CA", "Needs special human"),
    Dog(22, "Stormie", R.drawable.dog22, FEMALE, "San Jose, CA", "Perfect"),
    Dog(23, "Cash", R.drawable.dog23, MALE, "Campbell, CA", "Perfect"),
    Dog(24, "Diesel", R.drawable.dog24, MALE, "Campbell, CA", "Gentle to all"),
    Dog(25, "Sax", R.drawable.dog25, FEMALE, "Campbell, CA", "Looking for love"),
    Dog(26, "Nev", R.drawable.dog26, FEMALE, "Campbell, CA", "Looking for love"),
    Dog(27, "Thor", R.drawable.dog27, MALE, "San Jose, CA", "Needs special human"),
    Dog(28, "Adam", R.drawable.dog28, MALE, "San Jose, CA", "Needs special human"),
    Dog(29, "Kelly", R.drawable.dog29, FEMALE, "San Jose, CA", "Perfect"),
    Dog(30, "Gwendolyne", R.drawable.dog30, FEMALE, "San Jose, CA", "Gentle to all"),
    Dog(31, "Bullo", R.drawable.dog31, MALE, "San Jose, CA", "Looking for love"),
    Dog(32, "Harley", R.drawable.dog32, MALE, "Milpitas, CA", "Gentle to all"),
    Dog(33, "Turbo", R.drawable.dog33, MALE, "San Jose, CA", "Looking for love"),
    Dog(34, "Zoe", R.drawable.dog34, FEMALE, "San Jose, CA", "Gentle and affectionate"),
    Dog(35, "Sushi", R.drawable.dog35, FEMALE, "Milpitas, CA", "Gentle and affectionate"),
    Dog(36, "Karma", R.drawable.dog36, MALE, "San Jose, CA", "Gentle to all"),
    Dog(37, "Roy", R.drawable.dog37, MALE, "Milpitas, CA", "Looking for love"),
    Dog(38, "Armani", R.drawable.dog38, MALE, "Campbell, CA", "Looking for love"),
    Dog(39, "Sorrel", R.drawable.dog39, MALE, "San Jose, CA", "Looking for love"),
    Dog(40, "Mustard", R.drawable.dog40, FEMALE, "Milpitas, CA", "Needs special human"),
    Dog(41, "Chicory", R.drawable.dog41, FEMALE, "Milpitas, CA", "Perfect"),
    Dog(42, "Sage", R.drawable.dog42, MALE, "San Jose, CA", "Needs special human"),
    Dog(43, "Fennel", R.drawable.dog43, MALE, "Campbell, CA", "Looking for love"),
    Dog(44, "Curry", R.drawable.dog44, FEMALE, "Milpitas, CA", "Looking for love"),
    Dog(45, "Chervil", R.drawable.dog45, MALE, "Campbell, CA", "Perfect"),
    Dog(46, "Cayenne", R.drawable.dog46, FEMALE, "San Jose, CA", "Gentle to all"),
    Dog(47, "Budge", R.drawable.dog47, MALE, "Milpitas, CA", "Looking for love"),
    Dog(48, "Archie", R.drawable.dog48, MALE, "San Jose, CA", "Looking for love")
)
