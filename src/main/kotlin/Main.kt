import jdk.nashorn.internal.objects.Global.println
import projetokotlin.User
//Por falta de banco de dados o usuario já está cadastrado com e-mail raian.guilherme@gmailcom
// e senha 1234
//para fazer o login utilize, ou modifique na class
// ja utilize a opçao login, e não a de cadastro
fun main() {
    var user1 = User("", "raian.guilherme", "77", "", "")
    println(
        "Olá!!!\n" +
                "Bem vindo ao app Not + Hungry\n" +
                "MENU\n" +
                "1-Cadastro\n" +
                "2-Login\n"
    )
    var resp = readln().toInt()
    when (resp) {
        1 -> {
            println("***Cadastro de novo usuário***\n")
            user1.cadastroUser()
            user1.loginUser()
        }
        2 -> {
            user1.loginUser()

        }
    }
    do {
        println("Bem vindo ao app Fome Zero")
        println(
            "Informe o que deseja fazer\n" +
                    "1-Doar NF\n" +
                    "2-Ver produtos\n" +
                    "3-Consultar seu saldo de pontos:\n" +
                    "4-Resgatar produtos\n" +
                    "5-Informações sobre o app\n" +
                    "6-Deslogar"
        )
        var aux = readln().toInt()

        when (aux) {
            1 -> {
                user1.doarNota()

            }
            2 -> {
                var listProdutos = mutableListOf<String>("1-Camiseta", "2-Boné", "3-Vouncher15%", "4-Caneca")
                listProdutos.forEach {
                    println(it)
                }


            }
            3 -> {
                user1.mostrarSaldopontos()
                println()
            }
            4 -> {
                user1.resgatarProduto()
            }
            5 -> {
                user1.infoApp()
            }
            6 -> {
                println("Até mais!!")
            }
            else -> {
                println("Opção inválida!")
            }
        }
    } while (aux != 6)

}

fun readln(): Any {
    TODO("Not yet implemented")
}

