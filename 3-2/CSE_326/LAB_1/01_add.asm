.MODEL SMALL
.STACK 100H

.DATA
    a DB 'First Number is: $'
    b DB 'Second Number is: $'
    c DB 'Result is: $'

.CODE


MAIN PROC
    
    MOV AX, @DATA
    MOV DS, AX
    
    LEA DX, a
    MOV AH, 09H
    INT 21H
    
    MOV AH, 01H
    INT 21H
    MOV BL, AL
    
    MOV AH, 02H
    INT 21H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, b
    MOV AH, 09H
    INT 21H
    
    MOV AH, 01H
    INT 21H
    
    MOV CL, AL
    
    MOV AH, 02H
    INT 21H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, c 
    MOV AH, 09H
    INT 21H
    
    ADD BL, CL  
    
    SUB BL, 30H
    MOV DL, BL  
    
    MOV AH, 02H
    INT 21H
                  
    
    
    MAIN ENDP
END MAIN