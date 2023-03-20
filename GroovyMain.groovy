def countElements(list) {
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

def list = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(list)
println(result)