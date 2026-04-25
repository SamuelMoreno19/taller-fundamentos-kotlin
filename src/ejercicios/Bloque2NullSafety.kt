package ejercicios

fun ejecutarBloque2() {
    println("=== BLOQUE 2: NULL SAFETY ===")

    println("=== 6to ejercicio ===")

    // Ejercicio 6 - Opcional

    val apodo: String? = null
    println("6. Apodo: $apodo")

    println("=== 7mo ejercicio ===")

    // Ejercicio 7 - El operador elvis

    val resultadoApodo = apodo ?: "Sin apodo"
    println("7. Elvis dice: $resultadoApodo")

    println("=== 8to ejercicio ===")

    // Ejercicio 8 - La Llamada Segura

    println("8. Longitud del apodo (segura): ${apodo?.length}")

    println("=== 9no ejercicio ===")

    // Ejercicio 9 - El uso de Let

    val correo: String? = "ejemplo@correo.com"
    print("9. ")

    correo?.let {
        println("Correo enviado a $it")
    } ?: println("No hay correo para enviar")

    println("=== 10mo ejercicio ===")

    // Ejercicio 10 - La aserción No nula

    val valorNoNulo: String? = "Kotlin"
    println("10. Longitud con !!: ${valorNoNulo!!.length}")
}