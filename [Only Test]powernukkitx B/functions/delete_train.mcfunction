#ATACS解放
execute as @e[tag=body,c=1] at @s run execute as @e[type=tcmb:tcmb_car,r=2,tag=x_plus] at @s run event entity @e[type=tcmb:tcmb_car,tag=x_plus,tag=atacs_on,rm=2,dx=-600] datc_100
execute as @e[tag=body,c=1] at @s run execute as @e[type=tcmb:tcmb_car,r=2,tag=x_minus] at @s run event entity @e[type=tcmb:tcmb_car,tag=x_minus,tag=atacs_on,rm=2,dx=600] datc_100
execute as @e[tag=body,c=1] at @s run execute as @e[type=tcmb:tcmb_car,r=2,tag=z_plus] at @s run event entity @e[type=tcmb:tcmb_car,tag=z_plus,tag=atacs_on,rm=2,dx=-600] datc_100
execute as @e[tag=body,c=1] at @s run execute as @e[type=tcmb:tcmb_car,r=2,tag=z_minus] at @s run event entity @e[type=tcmb:tcmb_car,tag=z_minus,tag=atacs_on,rm=2,dx=600] datc_100
#削除処理
execute as @e[tag=body,c=1] at @s run ride @e[tag=body,r=2] stop_riding
execute as @e[tag=body,c=1] at @s run event entity @e[type=tcmb:tcmb_car,r=2] delete
execute as @e[tag=body,c=1] at @s run tp @e[tag=body,r=2] ~ -128 ~