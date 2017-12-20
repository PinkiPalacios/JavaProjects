            .data

lugar:      .byte 190,70
crlf:       .byte 13,10,00
cuatro:     .word 4
saludo:     .asciiz "Los numeros perfectos > 4 son: "                    

            .text
            
            .globl main
            
main:       la $a0,saludo
            li $v0,4
            syscall
            
            lw  $t0,cuatro   # candidato a numero perfecto
loop1:      div $t1,$t0,2    # divisores del candidato empezando por su mitad
            li  $t2,0        # suma de los divisores limpios
            
loop2:      move $t3,$t0     # este es el loop de los divisores
            div $t3,$t3,$t1
            mfhi $t4
            bnez $t4,siga
            add  $t2,$t2,$t1
siga:       addi $t1,$t1,-1
            bgtz $t1,loop2
            bne  $t0,$t2,siga2
            
            move  $t6,$t0  #inicio de la conversion de entero binario entre 4 y 99 a string[2]
            div  $t6,$t6,10
            mfhi $t5       #unidades se recupera de $hi
            ori  $t5,$t5,0x0030  # se le fuerza un nibble 3
            sb   $t5,lugar+1     # y se guarda en la segunda posicion del string
            mflo $t5             # decenas se recupera de $lo
            ori  $t5,$t5,0x0030  # se le fuerza un nibble 3
            sb   $t5,lugar       # y se guarda en la primera posicion del string
            
            li   $v0,4           # el string que contiene valores entre "04" y "99" se despliega
            la   $a0,lugar
            
            
            syscall
            
            la $a0,crlf
            li $v0,4
            syscall
            
siga2:      addi $t0,$t0,1
            ble  $t0,100,loop1    
                                                                
            li $v0,10
            syscall             