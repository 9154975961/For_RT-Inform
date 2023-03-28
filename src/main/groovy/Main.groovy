  static def countElements(list) {
    def counts = [:]
    list.each { item ->
      if (counts.containsKey(item)) {
        counts[item] += 1
      } else {
        counts[item] = 1
      }
    }
    return counts
  }

  def inputList = []

  print("Введите элементы списка через запятую: ")
  def scanner = new Scanner(System.in)
  def input = scanner.nextLine().split(",")

  input.each {
    item ->
    def trimmedItem = item.trim()
    if (!trimmedItem.isEmpty()) {
      inputList.add(trimmedItem as Integer)
    }
  }


  def result = countElements(inputList)

  println(result)
