package ejercicios

fun ejecutarBloque5() {
    println("\n=== BLOQUE 5: FUNCIONES ===")

    println("=== 21ro ejercicio ===")

    // Ejercicio 21 - El saludo personalizado
    println("21. ${saludar("Jhon")}")

    println("=== 22do ejercicio ===")

    // Ejercicio 22 - La suma exprés
    println("22. Suma de 15 + 30 = ${sumar(15, 30)}")

    println("=== 23ro ejercicio ===")

    // Ejercicio 23 - El parámetro por Defecto
    println("23. Creando rectángulo con default:")
    crearRectangulo(5)

    println("=== 24to ejercicio ===")

    // Ejercicio 24 - Los argumentos nombrados
    println("24. Creando rectángulo con argumentos nombrados:")
    crearRectangulo(ancho = 20)

    println("=== 25to ejercicio ===")

    // Ejercicio 25 - El conversor
    val usd = 50.0
    println("25. $usd USD equivalen a ${convertirDolaresAMonedaLocal(usd)} de moneda local")
}

    fun saludar(nombre: String): String {
    return "Hola, $nombre, ¡bienvenido al taller!"
}

    fun sumar(a: Int, b: Int) = a + b

    fun crearRectangulo(ancho: Int, alto: Int = 10) {
        println("   Rectángulo de $ancho x $alto")
}

    fun convertirDolaresAMonedaLocal(dolares: Double): Double {
    val tasaCambio = 4000.0 // Ejemplo: 1 USD = 4000 COP
    return dolares * tasaCambio
}