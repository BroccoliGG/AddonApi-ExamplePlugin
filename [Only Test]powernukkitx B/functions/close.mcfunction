execute as @s[tag=open_all] at @s run event entity @e[tag=body,r=1] close_all
tag @s remove open_all 
execute as @s[tag=open_a] at @s run event entity @e[tag=body,r=1] close_a
tag @s remove open_a
execute as @s[tag=oneman_open_a] at @s run event entity @e[tag=body,r=1] oneman_close_a
tag @s remove oneman_open_a
execute as @s[tag=open_b] at @s run event entity @e[tag=body,r=1] close_b
tag @s remove open_b
execute as @s[tag=oneman_open_b] at @s run event entity @e[tag=body,r=1] oneman_close_b
tag @s remove oneman_open_b
function pdft/close