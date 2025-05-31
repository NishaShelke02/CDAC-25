const eventForm = document.getElementById('eventForm');
const scheduleTable = document.getElementById('scheduleTable').querySelector('tbody');
const messageDiv = document.getElementById('message');

eventForm.addEventListener('submit', function (e) {
    e.preventDefault();

    const name = eventForm.eventName.value;
    const team1 = eventForm.team1.value;
    const team2 = eventForm.team2.value;
    const date = eventForm.eventDate.value;
    const time = eventForm.eventTime.value;
    const location = eventForm.eventLocation.value;

    const row = scheduleTable.insertRow();
    row.innerHTML = `
        <td>${name}</td>
        <td>${location}</td>
        <td>${team1}</td>
        <td>${team2}</td>
        <td>${date}</td>
        <td>${time}</td>
        <td>
            <button class="view">View</button>
            <button class="edit">Edit</button>
            <button class="delete">Delete</button>
        </td>
    `;

    row.querySelector('.view').onclick = () => {
        alert(`Event: ${row.cells[0].textContent}\n${row.cells[2].textContent} vs 
            ${row.cells[3].textContent}\nDate: ${row.cells[4].textContent} Time: 
            ${row.cells[5].textContent}\nLocation: ${row.cells[1].textContent}`);
    };

    row.querySelector('.edit').onclick = () => {
        eventForm.eventName.value = row.cells[0].textContent;
        eventForm.eventLocation.value = row.cells[1].textContent;
        eventForm.team1.value = row.cells[2].textContent;
        eventForm.team2.value = row.cells[3].textContent;
        eventForm.eventDate.value = row.cells[4].textContent;
        eventForm.eventTime.value = row.cells[5].textContent;
        row.remove();
    };

    row.querySelector('.delete').onclick = () => {
        row.remove();
        showMessage('Event Deleted');
    };

    eventForm.reset();
    showMessage('Event Scheduled!');
});

// Show message in the #message div and clear after 2 seconds
function showMessage(msg) {
    messageDiv.textContent = msg;
    setTimeout(() => {
        messageDiv.textContent = '';
    }, 2000);
}
