import random
print(f"{'It is a game of Hand Cricket!': ^40}")
def Game_Starts_Ubat_Bbowl():                        #Function when user bats first and bot bowls first
   su=int(input("Score between 1 to 10: "))
   if su<1 or su>10:
      print("Enter a valid score...")
      Game_Starts_Ubat_Bbowl()
   sb=random.randint(1,10)
   if su==sb:
      print("Number by Bot: ", sb)
      print("That's it, You are OUT!!")
      score=0
   else: 
      print("Number by Bot: ", sb)
      score=su
   while su!=sb:
      su=int(input("Score between 1 to 10: "))
      if su<1 or su>10:
         print("Enter a valid score... ")
         continue
      sb=random.randint(1,10)
      if su==sb:
        print("Number by Bot: ", sb)
        print("That's it, You are OUT!!")
        score=score
        break
      if su==6:
        print(f"{'Thats a SIX!' : ^40}")
      if su==4:
        print(f"{'Thats a FOUR!': ^40}")
      score=score + su
      print("Number by Bot: ", sb)
      print("Total Score:",score )
   Target=score+1
   print("Target set is: ", Target)
   print("Now, it's time for you to BALL...")

   su1=int(input("Bowl for score between 1 to 10: "))
   sb1=random.randint(1,10)
   if su1==sb1:
      print("Oh Noo! I am OUT!")
      Score=0
   else: Score=sb1
   if Score>=Target:
            print("Runs: ", sb1)
            print("OOHH! You LOSE the Game. Better Luck Next Time.")
            print(f"{'!!GAME OVER!!' : ^40}")
            return
   else:
            print("Runs: ", sb1)
            print("Score: ", Score)
            print("Target: ", Target)   
            print("Remaining score: ", Target-Score)
   while su1!=sb1:
         su1=int(input("Bowl for score between 1 to 10: "))
         if su1<1 or su1>10:
            print("Enter a a valid number...")
            continue
         sb1=random.randint(1,10)
         if su1==sb1:
            print("Run by Bot: ", sb1)
            print("Hurray! That's a WICKET!!")
            Score=Score
            print("Congrats! You WON the match by", Target-Score, "runs.")
            print(f"{'!!GAME OVER!!' : ^40}") 
            break
         if sb1==4:
            print(f"{'Thats a FOUR!' : ^40}")
         if sb1==6:
            print(f"{'Thats a SIX!' : ^40}")
         Score=Score+sb1
         print("Runs: ", sb1)
         print("Score: ", Score)
         print("Target: ", Target)   
         print("Remaining score: ", Target-Score)
         if Score>=Target:
            print("OOHH! You LOSE the Game. Better Luck Next Time.")
            print(f"{'!!GAME OVER!!' : ^40}")
            break  

def Game_Starts_Bbat_Ubowl():                                      #Function when bot balls first and user bats first
   Su=int(input("Bowl for Score between 1 to 10: "))
   if Su<1 or Su>10:
      print("Enter a valid number...")
      Game_Starts_Bbat_Ubowl()
   Sb=random.randint(1,10)
   if Su==Sb:
      print("Runs by Bot: ", Sb)
      print("Ohh No! I am OUT!!")
      score=0
   else: 
      print("Score: ", Sb)
      score=Sb
   while Su!=Sb:
      Su=int(input("Bowl for Score between 1 to 10: "))
      if Su<1 or Su>10:
         print("Enter a valid number... ")
         continue
      Sb=random.randint(1,10)
      if Su==Sb:
        print("Runs by Bot: ", Sb)
        print("Ohh No! I am OUT!!")
        score=score
        break
      if Sb==6:
        print(f"{'Thats a SIX!' : ^40}")
      if Sb==4:
        print(f"{'Thats a FOUR!': ^40}")
      score=score + Sb
      print("Runs by Bot: ", Sb)
      print("Total Score:",score )
   Target=score+1
   print("Target set is: ", Target)
   print("Now, it's time for you to BAT...")

   Su1=int(input("Score between 1 to 10: "))
   Sb1=random.randint(1,10)
   if Su1==Sb1:
      print("Number by Bot: ", Sb1)
      print("That's it, You are OUT!")
      Score=0
   else: Score=Su1
   if Score>=Target:
         print("Number by Bot: ", Sb1)
         print("GOTCHA! You WON the Game.")
         print(f"{'!!GAME OVER!!' : ^40}")
         return
   else:
         print("Runs: ", Su1)
         print("Number by Bot", Sb1)
         print("Score: ", Score)
         print("Target: ", Target)   
         print("Remaining score: ", Target-Score)
   while Su1!=Sb1:
         Su1=int(input("Score between 1 to 10: "))
         if Su1<1 or Su1>10:
            print("Enter a a valid score...")
            continue
         Sb1=random.randint(1,10)
         if Su1==Sb1:
            print("Number by Bot: ", Sb1)
            print("Ohh No! That's a WICKET!!")
            Score=Score
            print("You LOSE the match by", Target-Score, "runs.")
            print(f"{'!!GAME OVER!!' : ^40}") 
            break
         if Su1==4:
            print(f"{'Thats a FOUR!' : ^40}")
         if Su1==6:
            print(f"{'Thats a SIX!' : ^40}")
         Score=Score+Su1
         print("Runs: ", Su1)
         print("Number by bot: ", Sb1)
         print("Score: ", Score)
         print("Target: ", Target)   
         print("Remaining score: ", Target-Score)
         if Score>=Target:
            print("GOTCHA! You WON the match.")
            print(f"{'!!GAME OVER!!' : ^40}")
            break
               
def user_bat_or_bowl():                                            #Choice for user to bat or bowl
   print("Choose Batting or Bowling...")
   c=int(input("Bat or Bowl(1 for Bat;2 for bowl): "))
   if c==1:
      print("You chose to BAT first.")
      Game_Starts_Ubat_Bbowl()
   if c==2:
      print("You chose to BOWL first.")
      Game_Starts_Bbat_Ubowl()
   if c!=1 and c!=2:
      print("Please specify Bat or Bowl...") 
      user_bat_or_bowl()  
def bot_bat_or_bowl():                                            #choice for bot to bat or ball
    r=random.randint(1,2)
    if r==1:
       print("I choose to BAT first. ")
       Game_Starts_Bbat_Ubowl()
    if r==2:
       print("I choose to BOWL first. ")
       Game_Starts_Ubat_Bbowl()  
      
def toss():                                                           #function for tossing to get head or tails
   t=int(input("Choose Head or Tails(1 for head;2 for tails): "))
   n=random.randint(1,2)
   if t==1 and t==n:                                                 #if user chooses head and bot throws the same number, user wins the toss
      print("Congrats, it's a Head. You won the toss! :) ")
      user_bat_or_bowl()
   elif t==2 and t==n:                                               #if user chooses tail and bot throws the same number, user wins the toss
      print("Congrats, it's a Tail. You won the toss! :) ")
      user_bat_or_bowl()
   elif t==1 and t!=n:                                               #if user chooses head and bot does not throw the same number, user loses the toss
      print("Oooh! It's a Tail. You lose the toss.\nI won the toss... ")
      bot_bat_or_bowl()
   elif t==2 and t!=n:                                               #if user chooses tail and bot does not throw the same number, user loses the toss
      print("Oooh! It's a Head. You lose the toss.\n I won the toss...")
      bot_bat_or_bowl()
   else:
      print("Please specify Head or Tails... ")
      toss()
toss()
choice=int(input("Enter 1 to replay or 0 to exit: "))
if choice==1:
   toss()
else: print("It was fun playing with you!! :)")


   



      