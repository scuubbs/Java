def addname():
	nm = input("Enter name to add to list: ")
	names.append(nm)
	return

names = ["Robert", "Robbie", "Rob", "Bob"]
names.append("Scuubbs")

addname()

for n in names:
	print(f"Name from the list is {n}")

name = "Robert Collins"
for nc in name:
	print(nc)

tp = (10.0, 20.0)
print(tp[0])

st = set()
st.add(1)
st.add(3.5)
st.add(9.9999)
print(st)

dc = {"scuubbs":"awesome coder from way back", "Robbie":"Same dude..lol"}
print(dc)
for d in dc:
	print(dc[d])



