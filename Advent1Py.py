data = open("input.txt").readlines()

def calc_fuel(mass):
    return int(mass) // 3 - 2

sum = 0
for mass in data:
    fuel = calc_fuel(mass)
    while fuel > 0:
        sum = sum + fuel
        fuel = calc_fuel(fuel)
print(sum)
