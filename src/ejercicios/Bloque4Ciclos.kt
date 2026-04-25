package ejercicios

fun ejecutarBloque4() {
    println("=== BLOQUE 4: CICLOS ===")

    println("=== 16to ejercicio ===")

    // Ejercicio 16 - El conteo simple
    print("16. For 1-10: ")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    println("=== 17mo ejercicio ===")

    // Ejercicio 17 - La cuenta regresiva
    print("17. DownTo 10-1: ")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    println("=== 18vo ejercicio ===")

    // Ejercicio 18 - Los saltos de 3
    print("18. Step 3 (1-20): ")
    for (i in 1..20 step 3) {
        print("$i ")
    }
    println()

    println("=== 19no ejercicio ===")

    // Ejercicio 19 - El While Infinito (Casi)
    var energia = 5
    print("19. Descargando: ")
    while (energia > 0) {
        print("[$energia%] ")
        energia--
    }
    println("Sin energía")

    println("=== 20mo ejercicio ===")

    // Ejercicio 20 - El Do-While
    var contrasena: String
    var intentos = 0
    println("20. Simulación Do-While (Password):")
    do {
        // En una app real pediríamos input, aquí simulamos
        contrasena = if (intentos < 2) "abcd" else "1234"
        println("   Intento ${intentos + 1}: Ingresando '$contrasena'")
        intentos++
    } while (contrasena != "1234")
    println("¡Acceso concedido!")
}