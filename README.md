# CAESAR CIPHER
 #### v1, as of, 7th October, 2019

 ### BY: Sharon Ivy Kendi M.

## DESCRIPTION:
   A Caesar cipher is a type of substitution in which each letters are shifted  by a certain key, that is, a certain number of places down the alphabet.

#### Built With:
  * [Java](https://www.java.com/)
  * [Intellij Idea](https://www.jetbrains.com/idea/)

## Specifications:
  **(using Behaviour Driven Development )**
   Behaviour:
   *The program should:*
   _**Encryption;**_
| Input  | Key | Output |
| :----: |:----:|:----:|
| abc | 2 | cde |
| Hello | 1 | Iffmp |
   _**Decryption;**_
| Input  | Key | Output |
| :----: |:----:|:----:|
| cde | 2 | abc |
| Iffmp | 1 | Iffmp |

## Project Pre-requisites:
  You need the following installed on your machine
  - Java
  - Java Development Kit(JDK)
  To confirm run the following command on your Linux command line:
  ```
  $ java -version
  ```

## Project Demo:
  <img src="./src/img/screenshot.png" width="600px"/>
  
## Project setup requirements:
  * See pre-requisites
  * Fork this repository
  * Run the command;
  'git clone https://github.com/SharonIvy/githubsearch.git' to clone

## Set-up process:
  * Having cloned this repository to your local machine navigate to the folder you cloned into and open the terminal from there.
  * Run the following commands on your LInux command line:
    ```
    $ cd src/main/java
    $ java App
 ### Running Tests;
  _This is a sample test that tests if the getter method works:_
  ```
  @Test
  public void ceaseCipher_getmWord_String(){
    CeaserCipher testCeaser = new CeaserCipher("Hell0",1);
    assertEquals("Hello", testCeaser.getmWord());
  }
  ```
## Known Bugs
 No bugs detected during the development of this project.
 :+1:
  
## License:
  MIT License
    Copyright (c) 2018 **Sharon Ivy Kendi M.**
  
## Support and contact details:
  e-mail; kendishivy72@gmail.com
