package ejercicios

fun ejecutarBloque3() {
    println("=== BLOQUE 3: CONDICIONALES ===")

    println("=== 11vo ejercicio ===")

    // Ejercicio 11 - La mayoría de edad
    val edad = 20
    if (edad >= 18) {
        println("11. Puede votar")
    } else {
        println("11. No puede votar")
    }

    println("=== 12do ejercicio ===")

    // Ejercicio 12 - El if como Expresión
    val nota = 4.2
    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println("12. Resultado académico: $resultado")

    println("=== 13ro ejercicio ===")

    // Ejercicio 13 - El semáforo
    val colorSemaforo = "Rojo"
    print("13. Semáforo en $colorSemaforo: ")
    when (colorSemaforo) {
        "Rojo" -> println("Pare")
        "Amarillo" -> println("Precaución")
        "Verde" -> println("Siga")
        else -> println("Color inválido")
    }

    println("=== 14to ejercicio ===")

    // Ejercicio 14 - Los rangos en When
    val temperatura = 22
    print("14. Temperatura $temperatura°C: ")
    when {
        temperatura < 15 -> println("Frío")
        temperatura in 15..25 -> println("Templado")
        temperatura > 25 -> println("Calor")
    }

    println("=== 15to ejercicio ===")

    // Ejercicio 15 - Verificación de Tipo
    val variableAnonima: Any = "Soy un String"
    print("15. Tipo de dato: ")
    when (variableAnonima) {
        is String -> println("Es un String")
        is Int -> println("Es un Int")
        is Boolean -> println("Es un Booleano")
        else -> println("Tipo desconocido")
    }
}