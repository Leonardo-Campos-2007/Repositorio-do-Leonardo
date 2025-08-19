#include <stdio.h>
#include <stdlib.h>

int main()
{

    FILE * fp;

    fp = fopen("teste.txt", "a");

    if(fp == NULL)
    {  
        printf("ERRO, O ARQUIVO O NAO ABERTO");
        exit(1);
    }

    fprintf(fp,"O Santos foi solado pelo Vasco\n");

    printf("Arquivo Aberto");
    fclose(fp);


}
