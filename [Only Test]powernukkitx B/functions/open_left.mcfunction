tag @s[scores={speed=0}] add stopping
tag @s[scores={speed=0}] remove ato_on
execute as @s[scores={speed=0}] at @s run tag @e[tag=body,r=1] remove ato_on
tag @s remove open_a
tag @s remove oneman_open_a
tag @s remove open_b
tag @s remove oneman_open_b
tag @s remove open_all
execute as @s[tag=!backward] at @s run event entity @e[tag=body,r=1] open_a
tag @s[tag=!backward]add open_a 
execute as @s[tag=backward] at @s run event entity @e[tag=body,r=1] open_b
tag @s[tag=backward]add open_b 
execute as @s[tag=!backward] at @s run summon armor_stand ^^^1
execute as @s[tag=backward] at @s run summon armor_stand ^^^-1
function pdft/open
kill @e[type=minecraft:armor_stand,c=1,r=3]