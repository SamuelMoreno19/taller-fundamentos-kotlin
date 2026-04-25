package ejercicios

fun ejecutarBloque1() {
    println("=== BLOQUE 1: VARIABLES ===")

    println("=== 1er ejercicio ===")

    // Ejercicio 1 - Perfil del Usuario

    val nombre = "Samuel Moreno"
    var ciudad = "Medellin - Bello"

    println("Ciudad: $ciudad")
    println("Nombre: $nombre")

    ciudad = "Malaga"
    println("Nueva Ciudad: $ciudad")


    println("=== 2do ejercicio ===")

    // Ejercicio 2 - Calculadora de años

    val AnioNacimiento = 2007
    val AnioActual = 2026

    val edad = AnioActual - AnioNacimiento

    println("Tengo $edad años")

    println("=== 3er ejercicio ===")

    // Ejercicio 3 - Los tipos explicitos

    val precioCoche: Double = 250000.89
    val pesoNaranja: Float = 0.25f
    val poblacionMundial: Long = 8000000000L

    println("3. Coche: $precioCoche, Naranja: ${pesoNaranja}, Población: $poblacionMundial")


    println("=== 4to ejercicio ===")

    // Ejercicio 4 - La inferencia

    val estaLloviendo = false
    println("¿Está lloviendo? $estaLloviendo")

    println("=== 5to ejercicio ===")

    // Ejercicio 5 - Constantes reales

    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}

    object Constants {
    const val VELOCIDAD_LUZ = 299792458
}
