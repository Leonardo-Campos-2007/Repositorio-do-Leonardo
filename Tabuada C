#include <stdio.h>
#include <stdlib.h>

int main()
{

    FILE * fp;

    fp = fopen("tebuada.txt", "a");

    if(fp == NULL)
    {

        printf("ERRO: arquivo não foi aberto\n");
        exit(1);

    }

    fprintf(fp,"Tabuada do 9\n\n");

    for(int i = 1; i <= 10; i++)
    {

        fprintf(fp, "9 x %d = %d\n", i, 9 * i);

    }

}
