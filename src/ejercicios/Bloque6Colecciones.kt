package ejercicios

fun ejecutarBloque6() {
    println("=== BLOQUE 6: COLECCIONES Y EXTENSIONES ===")

    println("=== 26to ejercicio ===")

    // Ejercicio 26 - La lista de compras
    val listaCompras = mutableListOf("Leche", "Pan", "Huevos")
    println("26. Lista inicial: $listaCompras")
    listaCompras.add("Café")
    listaCompras.removeAt(1) // Elimina "Pan"
    println("    Lista modificada: $listaCompras")

    println("=== 27mo ejercicio ===")

    // Ejercicio 27 - El filtro de precios
    val precios = listOf(10, 55, 25, 100, 40, 80)
    val baratos = precios.filter { it < 50 }
    println("27. Precios menores a 50: $baratos")

    println("=== 28vo ejercicio ===")

    // Ejercicio 28 - El buscador
    val amigos = listOf("Juan", "Alicia", "Pedro", "Ana")
    val primerConA = amigos.find { it.startsWith("A") }
    println("28. Primer amigo con 'A': $primerConA")

    println("=== 29no ejercicio ===")

    // Ejercicio 29. La extensión de Int
    val numero = -5
    println("29. ¿Es $numero negativo? ${numero.esNegativo()}")

    println("=== 30mo ejercicio ===")

    // Ejercicio 30 - La extensión de String
    val textoConEspacios = "K o t l i n   e s   g e n i a l"
    println("30. Texto original: '$textoConEspacios'")
    println("    Sin espacios: '${textoConEspacios.quitarEspacios()}'")
}

   // 2da parte del ejercicio 29 - extensión de Int
   fun Int.esNegativo(): Boolean = this < 0

   // 2da parte del ejercicio 30 - extensión de String
   fun String.quitarEspacios(): String = this.replace(" ", "")