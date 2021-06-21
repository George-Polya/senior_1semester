from socket import *
from time import perf_counter, strftime

print("Client Start")
print("="*30)
serverIP = "localhost"
serverPort = 12000

serverAddr = (serverIP, serverPort)

clientSocket = socket(AF_INET, SOCK_DGRAM)
clientSocket.settimeout(1)


try:
    for i in range(10):
        message = input("Clinet Message : ")
        start = perf_counter()
        clientSocket.sendto(message.encode(), serverAddr)
        try:
            modified, server = clientSocket.recvfrom(1024)
            end = perf_counter()

            print("Ping {:2}         RTT: {} sec".format(
                (i+1), str(end-start)))
            print("Reply: "+modified.decode())
        except timeout:
            print("Ping {:2}         Request timed out".format((i+1)))
        print()
finally:
    clientSocket.close()
    print("="*30)
    print("Socket closed")
