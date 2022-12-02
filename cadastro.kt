open class Pessoa(val nome: String)

class Fisica(val cpf: String, val nomePessoa: String, val telefone: String, val rg: String ) : Pessoa(nomePessoa)


fun verificaTipoPessoa(pessoa: Pessoa): String {
    when(pessoa) {
        is Fisica -> return "Nome: ${pessoa.nome} \nCpf: ${pessoa.cpf} \nTelefone: ${pessoa.telefone} \nRG: ${pessoa.rg}" 
        else -> return "Desconhecido"
    }
}

fun main(args: Array<String>) {
    val pessoaFisica = Fisica("000.000.000-00", "Nome Sobrenome", "(00) 9 9999-9999", "XX-00.000.000")
    
    println(verificaTipoPessoa(pessoaFisica))
}
