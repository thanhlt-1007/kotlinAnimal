open class Animal {
  open val image = ""
  open val food = ""
  open val habitat = ""
  var hunger = 10

  open fun makeNoise() {
    println("The Animal is making a noise")
  }

  open fun eat() {
    println("The Animal is eating")
  }

  open fun roam() {
    println("The Animal is roaming")
  }

  fun sleep() {
    println("The Animal is sleeping")
  }
}

class Hippo : Animal() {
  override val image = "hippo.jpg"
  override val food = "grass"
  override val habitat = "water"

  override fun makeNoise() {
    println("Grunt! Grunt!")
  }

  override fun eat() {
    println("The Hippo is eating $food")
  }
}

open class Canine : Animal() {
  override fun roam() {
    println("The Canine is roaming")
  }
}

class Wolf : Canine() {
  override val image = "wolf.jpg"
  override val food = "meat"
  override val habitat = "forest"

  override fun makeNoise() {
    println("Hooooow!")
  }

  override fun eat() {
    println("The Wolf is eating $food")
  }
}

class Vet {
  fun giveShot(animal: Animal) {
    // Code to do something medical
    animal.makeNoise()
  }
}

fun main() {
  var animal = Animal()
  println("--- Animal --- ")
  println("image: ${animal.image}")
  println("food: ${animal.food}")
  println("habitat: ${animal.habitat}")
  println("hunger: ${animal.hunger}")
  animal.makeNoise()
  animal.eat()
  animal.roam()
  animal.sleep()

  var hippo = Hippo()
  println("--- Hippo --- ")
  println("image: ${hippo.image}")
  println("food: ${hippo.food}")
  println("habitat: ${hippo.habitat}")
  println("hunger: ${hippo.hunger}")
  hippo.makeNoise()
  hippo.eat()
  hippo.roam()
  hippo.sleep()

  var canine = Canine()
  println("--- Canine --- ")
  println("image: ${canine.image}")
  println("food: ${canine.food}")
  println("habitat: ${canine.habitat}")
  println("hunger: ${canine.hunger}")
  canine.makeNoise()
  canine.eat()
  canine.roam()
  canine.sleep()

  var wolf = Wolf()
  println("--- Wolf --- ")
  println("image: ${wolf.image}")
  println("food: ${wolf.food}")
  println("habitat: ${wolf.habitat}")
  println("hunger: ${wolf.hunger}")
  wolf.makeNoise()
  wolf.eat()
  wolf.roam()
  wolf.sleep()

  val vet = Vet()
  println("--- Vet --- ")
  vet.giveShot(animal)
  vet.giveShot(hippo)
  vet.giveShot(canine)
  vet.giveShot(wolf)
}
