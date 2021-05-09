import random
from socket import *

serverSocket = socket(AF_INET, SOCK_DGRAM)

serverSocket.bind(('', 12000))

print("Started UDP Server on port 12000")

while True:
    rand = random.randint(0, 10)

    message, address = serverSocket.recvfrom(1024)

    modifiedMessage = message.upper()

    if rand < 4:
        continue

    serverSocket.sendto(modifiedMessage, address)
