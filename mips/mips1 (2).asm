.data

hexdigits: .ascii "0123456789ABCDEF"

.text


la    $t0, hexdigits
li    $t1, 0        # $t1 = hexdigits[0]
lb    $t2, 1($t0)        # $t2 = hexdigits[1]

la    $t0, hexdigits          # address of the first element

loop:


lb    $a0, hexdigits($t1)            # hexdigits[10] (which is 'A')
li    $v0, 11                # I will assume syscall 11 is printchar (most simulators support it)
syscall  
addi $t1, $t1,1

ble $t1,16, loop
syscall                       # issue a system call