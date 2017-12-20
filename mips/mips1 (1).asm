.data 
 tabla: .space 97
        .byte 1
        .space 3
        .byte 1
        .space 3
        .byte 1
        .space 5
        .byte 1
        .space 5
        .byte 1
        .space 10
        
mensaje1 : .asciiz "hola como estas aaassffsgffsd"
mensaje2: .asciiz "cantidad de vocales es: \n"

.text


.globl main 

main :

li $t0,0
li $t1,0

ciclo:

lb $t2,mensaje1($t0)
lb $t3,tabla($t2)
add $t1,$t1,$t3
addi $t0,$t0,1
beqz $t2,final
b ciclo
final:

la $a0,mensaje2
li $v0,4
syscall
move $a0,$t1
 li $v0,1
syscall
li $v0,10

syscall 




