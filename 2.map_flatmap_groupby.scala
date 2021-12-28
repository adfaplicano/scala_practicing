object countting_letters_string {
    def main(args: Array[String]) = {
        val string = "estoy probando como funcionaria esto"
        val list_string = List(string)
        val flat_string = list_string.flatMap(value => value)
        val count_letters = flat_string.groupBy(value => value).map(value => (value._1, value._2.length))
        print(count_letters)
    }
}