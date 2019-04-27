package br.com.sandroni.calculaflex.extensions

fun Double.formats(digits:Int ) = java.lang.String.format("%.${digits}f",this)