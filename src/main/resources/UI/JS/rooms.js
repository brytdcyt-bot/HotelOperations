document.addEventListener("DOMContentLoaded", () => {
    const section = document.getElementById("rooms");
    section.innerHTML = `
    <h2>Room Availability</h2>
    <form id="roomForm">
      <label>Beds: <input type="number" id="roomBeds" min="1" value="2"></label>
      <label>Price: <input type="number" id="roomPrice" min="50" value="120"></label>
      <label>Occupied: <input type="checkbox" id="roomOccupied"></label>
      <label>Dirty: <input type="checkbox" id="roomDirty"></label>
      <button type="submit">Check</button>
    </form>
    <p id="roomOutput"></p>
  `;

    section.querySelector("#roomForm").addEventListener("submit", e => {
        e.preventDefault();
        const occupied = section.querySelector("#roomOccupied").checked;
        const dirty = section.querySelector("#roomDirty").checked;
        const available = !occupied && !dirty;
        section.querySelector("#roomOutput").textContent =
            available ? "✅ Room available" : "❌ Not available";
    });
});