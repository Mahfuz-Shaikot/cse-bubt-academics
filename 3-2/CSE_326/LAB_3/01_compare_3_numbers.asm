.MODEL SMALL
.STACK 100H

.DATA
    PROMPT_1 DB 'First Number: $'
    PROMPT_2 DB 'Second Number: $'
    PROMPT_3 DB 'Third Number: $'
    PROMPT_4 DB 'Greatest Number: $'
    
.CODE


MAIN PROC
    
    MOV AX, @DATA
    MOV DS, AX
    
    
    LEA DX, PROMPT_1
    MOV AH, 09H
    INT 21H
    
    MOV AH, 01H
    INT 21H
    
    MOV BL, AL
    
    MOV AH, 02H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, PROMPT_2
    MOV AH, 09H
    INT 21H
    
    MOV AH, 01H
    INT 21H
    
    MOV CL, AL
    
    MOV AH, 02H
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, PROMPT_3
    MOV AH, 09H 
    INT 21H
    
    MOV AH, 01H
    INT 21H
    
    MOV CH, AL
    
    MOV DL, 13
    INT 21H
    MOV DL, 10
    INT 21H
    
    LEA DX, PROMPT_4
    MOV AH, 09H
    INT 21H
        
    
    CMP BL, CL
    JG CHECK_G1_G3
    
    CHECK_G2_G3:    CMP CH, CL
                    JG G3
                    JMP G2
    
    
    CHECK_G1_G3:    CMP CH, BL
                    JG G3
                    JMP G1
                    
                    
    G1:     MOV DL, BL
            MOV AH, 02H
            INT 21H 
            JMP EXIT
    
    G2:     MOV DL, CL
            MOV AH, 02H
            INT 21H
            JMP EXIT
   
    G3:     MOV DL, CH
            MOV AH, 02H
            INT 21H 
            JMP EXIT
            
    EXIT:
    
    
    
MAIN ENDP
END MAIN
            
            
                     
   
        
        