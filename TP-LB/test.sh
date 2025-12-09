count1=0
count2=0

for ((i=0;i<100;i++))
do
    a=$(curl -s http://localhost:83/ | grep -o "Hello [12]")

    if [ "$a" = "Hello 1" ]
    then
        count1=$((count1 + 1))
    elif [ "$a" = "Hello 2" ]
    then
        count2=$((count2 + 1))
    fi
done

# affichage compteur
echo "Hello 1 répondu : $count1 fois"
echo "Hello 2 répondu : $count2 fois"